package org.swtk.commons.dict.wiktionary.generated.b.o.i;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBOI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("boilerman", "{\"term\":\"boilerman\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|boiler|man|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person who tends the fire for a steam engin\", \"priority\":1}]}, \"synonyms\":{}}");

	add("boiley", "{\"term\":\"boiley\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A meal of milk and bread boiled\", \"priority\":1}]}, \"synonyms\":{}}");

	add("boing", "{\"term\":\"boing\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"onomatopoeic|Onomatopoeic\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The sound made by an elastic object (such as a spring) when bouncing; the sound of a bounce\", \"priority\":1}]}, \"synonyms\":{}}");

	add("boink", "{\"term\":\"boink\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A real-world social gathering of computer users\", \"priority\":1}]}, \"synonyms\":{}}");

	add("boise", "{\"term\":\"boise\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The capital of the US state of Idaho\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }