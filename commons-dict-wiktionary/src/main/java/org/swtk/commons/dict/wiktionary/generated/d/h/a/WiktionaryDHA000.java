package org.swtk.commons.dict.wiktionary.generated.d.h.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDHA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("dhaincha", "{\"term\":\"dhaincha\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The legume \u0027Sesbania bispinosa\u0027, native to Asia and North Africa\", \"priority\":1}]}, \"synonyms\":{}}");

	add("dhaka", "{\"term\":\"dhaka\", \"etymology\":{\"influencers\":[], \"languages\":[\"Bengali\", \"English\"], \"text\":\"From Bengali \u0027ঢাকা\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The capital of Bangladesh\", \"priority\":1}]}, \"synonyms\":{}}");

	add("dharma", "{\"term\":\"dharma\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Sanskrit\"], \"text\":\"From Sanskrit \u0027sc\u003ddeva|धर्म|tr\u003ddhárma\u0027 (that which upholds or supports)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the principle that orders the universe; one\u0027s conduct in conformity with such a principl\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"one\u0027s obligation in respect to one\u0027s position in societ\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"the teachings of the Buddha as one\u0027s personal path to enlightenmen\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"quot;\u0027\u0027Dharma\u0027\u0027 practice in the tradition of the Theravada Buddhist masters enabled me to quit smoking and improve my relationships, oh, and by the way, to achieve nirvana.\u0026quot\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"the teachings of the Buddha as a practice to be promulgated and taught\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"quot;The Mahayana Buddhist teacher does not want you to chain smoke and quarrel with your loved ones, but your main focus in Mahayana is to spread the \u0027\u0027dharma\u0027\u0027 for the good of all sentient beings.\u0026quot\", \"priority\":6}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }