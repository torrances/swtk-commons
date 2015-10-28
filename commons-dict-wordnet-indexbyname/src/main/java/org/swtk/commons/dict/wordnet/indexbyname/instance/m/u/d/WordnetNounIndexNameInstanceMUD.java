package org.swtk.commons.dict.wordnet.indexbyname.instance.m.u.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMUD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mud\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06732886\", \"14980464\"]}");
	add("{\"term\":\"mudcat\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02522778\", \"07796014\"]}");
	add("{\"term\":\"mudder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02388328\"]}");
	add("{\"term\":\"muddiness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04711046\", \"05691387\", \"14558658\"]}");
	add("{\"term\":\"muddle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14432893\", \"14524151\"]}");
	add("{\"term\":\"mudguard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03802127\"]}");
	add("{\"term\":\"mudhif\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03802370\"]}");
	add("{\"term\":\"mudra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00336111\"]}");
	add("{\"term\":\"mudskipper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02622180\"]}");
	add("{\"term\":\"mudslide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07420179\"]}");
	add("{\"term\":\"mudslinger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10356250\"]}");
	add("{\"term\":\"mudspringer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02622180\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }