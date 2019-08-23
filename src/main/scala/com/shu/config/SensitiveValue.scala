package com.shu.config

final case class SensitiveValue[T] (value: T) extends AnyVal {
  override def toString: String = "****"
}
