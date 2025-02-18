```groovy
def myMethod(param) {
  if (param == null) {
    println "Parameter is null"
    return
  }
  // ... rest of the method
}

myMethod(null)
myMethod(["a","b"])
```