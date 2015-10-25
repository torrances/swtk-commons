package org.swtk.commons.dict.wiktionary.generated.u.p.s;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryUPS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("upscattering", "{\"term\":\"upscattering\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|up|scattering|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The increase in wavelength of radiation scattered by an electron\", \"priority\":1}]}, \"synonyms\":{}}");

	add("upshift", "{\"term\":\"upshift\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|up|shift|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A shift to a higher gea\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A shift to a higher level, such as of frequency or growth\", \"priority\":2}]}, \"synonyms\":{}}");

	add("upshot", "{\"term\":\"upshot\", \"etymology\":{\"influencers\":[], \"languages\":[\"official aramaic (700-300 bce)\", \"English\", \"Hebrew\"], \"text\":\"Said to come from \u0027up\u0027 + \u0027shot\u0027 referring to the last shot in a match of archery. Or alternatively from Hebrew or Judeo-Official aramaic (700-300 bce) \u0027פשט\u0027 (tr\u003dp’shat)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A concise summary\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"I\u0027m not interested in hearing all the details. Just give me the \u0027\u0027upshot\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The final result, or outcome of something\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027upshot\u0027\u0027 was that they had to get married\", \"priority\":4}]}, \"synonyms\":{}}");

	add("upside", "{\"term\":\"upside\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the highest or uppermost side or portion of somethin\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"a favourable aspect of something that also has an unfavourable aspec\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"an upward tendency, especially in a financial market etc\", \"priority\":3}]}, \"synonyms\":{}}");

	add("upstage", "{\"term\":\"upstage\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|up|stage|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The part of a stage that is farthest from the audience or camera\", \"priority\":1}]}, \"synonyms\":{}}");

	add("upstart", "{\"term\":\"upstart\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|up|start|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who has suddenly gained wealth, power, or other prominence, but either has not received social acceptance or has become arrogant or presumptuous\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The meadow saffron\", \"priority\":2}]}, \"synonyms\":{}}");

	add("upstater", "{\"term\":\"upstater\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|upstate|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person from upstate; usually specifically a person from upstate New York\", \"priority\":1}]}, \"synonyms\":{}}");

	add("upstep", "{\"term\":\"upstep\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|up|step|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An upward shift of tone between the syllables or words of a tonal language\", \"priority\":1}]}, \"synonyms\":{}}");

	add("upstir", "{\"term\":\"upstir\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{prefix|up|stir|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"commotion; disturbance, tumul\", \"priority\":1}]}, \"synonyms\":{}}");

	add("upswell", "{\"term\":\"upswell\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|up|swell|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A rising swell\", \"priority\":1}]}, \"synonyms\":{}}");

	add("upswing", "{\"term\":\"upswing\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{prefix|up|swing|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"an upward swin\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"an upward trend or an increase in activit\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Newspapers reported an \u0027\u0027upswing\u0027\u0027 in the company\u0027s sales last month\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }