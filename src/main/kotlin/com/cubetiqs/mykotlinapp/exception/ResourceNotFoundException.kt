package com.cubetiqs.mykotlinapp.exception

import java.lang.RuntimeException

class ResourceNotFoundException(message: String) : RuntimeException(message)