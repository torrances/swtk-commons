package org.swtk.commons.dict.wiktionary.generated.m.o.p;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryMOP000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("mopane", "{\"term\":\"mopane\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Tswana\"], \"text\":\"From Tswana \u0027mophane\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A tree, native to southern Africa\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The or\", \"priority\":2}]}, \"synonyms\":{}}");

	add("moper", "{\"term\":\"moper\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who mopes or is inclined to do so\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"He was a \u0027\u0027moper\u0027\u0027 and a complainer, and as such, was quite unpopular at parties\", \"priority\":2}]}, \"synonyms\":{}}");

	add("mophandle", "{\"term\":\"mophandle\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|mop|handle|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The handle of a mop\", \"priority\":1}]}, \"synonyms\":{}}");

	add("mopper", "{\"term\":\"mopper\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who mop\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2004\u0027\u0027, Janet Kieffer, \u0027Food Chain: Short Stories\u0027, Lost Horse Press, ISBN 0971726558, page 58\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"the kitchen \u0027\u0027mopper\u0027\u0027 was a short female Asian averting her gaze\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1839\u0027\u0027, John Briggs, \u0027The history of Jim Crow\u0027, Smallfield and Son, page 266\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A couple of \u0027\u0027moppers\u0027\u0027 were then sent into the coffee-room with their proper implements, and quickly removed the soiling the floor had sustained\", \"priority\":5}]}, \"synonyms\":{}}");

	add("moppet", "{\"term\":\"moppet\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|mop|et|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A child. Often used lovingly or in an affectionate way\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A rag baby; a puppet made of cloth\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A long-haired pet dog\", \"priority\":3}]}, \"synonyms\":{}}");

	add("moptop", "{\"term\":\"moptop\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|mop|top|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A style of haircut popularized by the Beatles\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }