@Grab('org.codehaus.groovy.modules.http-builder:http-builder:0.7.1')

import groovyx.net.http.RESTClient

def jokes = new RESTClient('http://tambal.azurewebsites.net')
def resp = jokes.get( path: '/joke/random/' )

assert resp.status == 500

println "Joke: " + resp.data.joke

