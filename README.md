# invoke

[![](https://jitpack.io/v/diasandre/invoke.svg)](https://jitpack.io/#diasandre/invoke)

arrow-kt invoke copy after being removed on 0.13.0 version. If you want to use the new approach, there is a example [here](https://gist.github.com/diasandre/42db29f7c7ef1fda551e0099498f079e)

- build.gradle
```
repositories {
	maven { url 'https://jitpack.io' }
}
        
dependencies {
    implementation 'com.github.diasandre:invoke:<version>'
}
```

- build.gradle.kts
```
repositories {
    maven {
        url = uri("https://jitpack.io")
    }
}

dependencies {
    implementation("com.github.diasandre:invoke:<version>")
}
```

to import: `import com.github.diasandre.invoke`

This version removes invoke implementation for more than four parameters and only applies partially to first value.

All rights reserved to [arrow-kt](https://github.com/arrow-kt/arrow) ©
