package org.swtk.commons.dict.wordnet.index.name.instance.l.e.v.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLEVE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"levee\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03663961\", \"03664085\", \"08271548\"]}");
	add("{\"term\":\"level\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"03370837\", \"06257026\", \"03541528\", \"03664184\", \"05139167\", \"13962925\", \"14451564\", \"05101152\"]}");
	add("{\"term\":\"leveler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10275264\"]}");
	add("{\"term\":\"leveling\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00045411\", \"00218912\", \"00914407\"]}");
	add("{\"term\":\"leveller\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10275264\"]}");
	add("{\"term\":\"lever\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03665012\", \"03665135\", \"03664618\"]}");
	add("{\"term\":\"leverage\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01101851\", \"05163864\", \"11493538\"]}");
	add("{\"term\":\"leveraging\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01101851\"]}");
	add("{\"term\":\"leveret\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02329415\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }