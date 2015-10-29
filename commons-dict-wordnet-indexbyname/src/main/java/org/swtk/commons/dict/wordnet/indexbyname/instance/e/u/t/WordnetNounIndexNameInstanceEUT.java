package org.swtk.commons.dict.wordnet.indexbyname.instance.e.u.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEUT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"eutamias\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02362787\"]}");
	add("{\"term\":\"eutamius asiaticus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02363132\"]}");
	add("{\"term\":\"eutamius sibiricus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02363132\"]}");
	add("{\"term\":\"eutectic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14613294\"]}");
	add("{\"term\":\"eutectoid steel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14876934\"]}");
	add("{\"term\":\"euterpe\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09589796\", \"12611603\"]}");
	add("{\"term\":\"euterpe oleracea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12611778\"]}");
	add("{\"term\":\"euthanasia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00220723\"]}");
	add("{\"term\":\"euthenics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06052436\"]}");
	add("{\"term\":\"eutheria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01888861\"]}");
	add("{\"term\":\"eutherian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01889397\"]}");
	add("{\"term\":\"eutherian mammal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01889397\"]}");
	add("{\"term\":\"euthynnus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02631097\"]}");
	add("{\"term\":\"euthynnus pelamis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02631230\"]}");
	add("{\"term\":\"eutrophication\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13497793\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }