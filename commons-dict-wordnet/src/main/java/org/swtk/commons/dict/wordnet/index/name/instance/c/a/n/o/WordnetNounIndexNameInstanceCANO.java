package org.swtk.commons.dict.wordnet.index.name.instance.c.a.n.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCANO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"canoe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02954794\"]}");
	add("{\"term\":\"canoeist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09910922\"]}");
	add("{\"term\":\"canola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07689746\"]}");
	add("{\"term\":\"canon\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"06442207\", \"06499566\", \"07056608\", \"09256353\", \"09911065\", \"06677339\"]}");
	add("{\"term\":\"canonisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01042422\"]}");
	add("{\"term\":\"canonist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09911182\"]}");
	add("{\"term\":\"canonization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01042422\"]}");
	add("{\"term\":\"canopus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09256041\"]}");
	add("{\"term\":\"canopy\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02955279\", \"02955545\", \"02955673\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }