package nl.knmi.geoweb.converters.json.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fi.fmi.avi.converter.AviMessageSpecificConverter;
import fi.fmi.avi.converter.ConversionSpecification;
import fi.fmi.avi.model.taf.TAF;

import nl.knmi.geoweb.converters.json.taf.FmiTafJsonStringParser;
import nl.knmi.geoweb.converters.json.taf.FmiTafJsonStringSerializer;

@Configuration
public class JsonConverter {

  /**
   * Pre-configured spec for {@link TAF} to GwJson format TAF document String.
   */
  public static final ConversionSpecification<TAF, String> TAF_FMI_POJO_TO_JSON_STRING = new ConversionSpecification<>(TAF.class, String.class,
          null, "FMI TAF, KNMI TAF JSON");

  /**
   * Pre-configured spec for GwJson format TAF document String to {@link TAF}.
   */
  public static final ConversionSpecification<String,TAF> TAF_JSON_STRING_TO_FMI_POJO = new ConversionSpecification<>(String.class, TAF.class,
          "FMI TAF, KNMI TAF JSON", null);

  @Bean
  public AviMessageSpecificConverter<TAF, String> fmiTafJsonStringSerializer() {
      return new FmiTafJsonStringSerializer();
  }

  @Bean
  public AviMessageSpecificConverter<String, TAF> fmiTafJsonStringParser() {
      return new FmiTafJsonStringParser();
  }
}