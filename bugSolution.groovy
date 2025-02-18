```groovy
def myMethod(param) {
  if (param == null || !(param instanceof Collection)) {
    println "Invalid parameter type.  Requires a collection or null"
    return //or throw an exception, depending on needs
  }
  // ... rest of the method, safe to access param as a Collection
  param.each { println it }
}

myMethod(null)
myMethod(["a","b"])
myMethod(123)
```