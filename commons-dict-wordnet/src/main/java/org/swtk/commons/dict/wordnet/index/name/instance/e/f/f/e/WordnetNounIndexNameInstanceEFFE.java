package org.swtk.commons.dict.wordnet.index.name.instance.e.f.f.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEFFE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"effect\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"14334775\", \"04816894\", \"06616419\", \"05926071\", \"04682671\", \"11430739\"]}");
	add("{\"term\":\"effecter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10066335\"]}");
	add("{\"term\":\"effectiveness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05041380\", \"05206554\"]}");
	add("{\"term\":\"effectivity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05206554\"]}");
	add("{\"term\":\"effector\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05305920\", \"05472880\", \"10066335\"]}");
	add("{\"term\":\"effects\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13266978\"]}");
	add("{\"term\":\"effectuality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05206554\"]}");
	add("{\"term\":\"effectualness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05206554\"]}");
	add("{\"term\":\"effectuation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00044888\"]}");
	add("{\"term\":\"effeminacy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04675496\"]}");
	add("{\"term\":\"effeminateness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04675496\"]}");
	add("{\"term\":\"effendi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09755222\"]}");
	add("{\"term\":\"efferent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05482390\"]}");
	add("{\"term\":\"effervescence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04740587\", \"13492884\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }