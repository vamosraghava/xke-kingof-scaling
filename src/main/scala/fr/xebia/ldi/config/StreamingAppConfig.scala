package fr.xebia.ldi.config

/**
  * Created by loicmdivad.
  */

object StreamingAppConfig {

  case class StreamingAppConfig(appId: String,
                                topics: TopicsConfig,
                                schemaRegistryUrl: String,
                                cloud: Option[ConfluentConfig] = None)
}

