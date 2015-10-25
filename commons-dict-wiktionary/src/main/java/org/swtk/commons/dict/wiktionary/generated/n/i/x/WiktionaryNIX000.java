package org.swtk.commons.dict.wiktionary.generated.n.i.x;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryNIX000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("nixonomics", "{\"term\":\"nixonomics\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|Nixon|economics|lang\u003den}}. Coined in a speech of the same title by w:Walter Heller|Walter Heller in October 1969. This is believed to be the first such term coined by blending a president\u0027s surname with the word \u0026quot;economics.\u0026quot; [http://query.nytimes.com/gst/fullpage.html?res\u003d9E0CEEDB153AF932A35752C1A964958260] Similar blends have been used to describe the economic policies of all subsequent US presidents except Ford.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The economic policies of the w:Richard Richard Nixon administration, 1969-1974\", \"priority\":1}]}, \"synonyms\":{}}");

	add("nixtamal", "{\"term\":\"nixtamal\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Spanish\", \"classical nahuatl\"], \"text\":\"From Spanish from Classical nahuatl \u0027nextamalli|lang\u003dnci\u0027 () from \u0027nextli|lang\u003dnci\u0027 () + \u0027tamalli|lang\u003dnci\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"hominy; maize kernels which have undergone nixtamalization, that is, hulling and soaking and cooking in a alkaline solution\", \"priority\":1}]}, \"synonyms\":{}}");

	add("nixtamalization", "{\"term\":\"nixtamalization\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|nixtamal|ization|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A process for the preparation of maize (corn) in which the grain is soaked and cooked in an alkaline solution, usually limewater, and hulled\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }