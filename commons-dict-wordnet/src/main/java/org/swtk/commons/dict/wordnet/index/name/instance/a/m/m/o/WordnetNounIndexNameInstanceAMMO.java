package org.swtk.commons.dict.wordnet.index.name.instance.a.m.m.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAMMO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ammo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02706134\"]}");
	add("{\"term\":\"ammobium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11940967\"]}");
	add("{\"term\":\"ammodytes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02621002\"]}");
	add("{\"term\":\"ammodytidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02620874\"]}");
	add("{\"term\":\"ammonia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14767761\", \"14768019\"]}");
	add("{\"term\":\"ammoniac\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14768155\"]}");
	add("{\"term\":\"ammonification\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13451435\"]}");
	add("{\"term\":\"ammonite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09218836\"]}");
	add("{\"term\":\"ammonium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14768299\"]}");
	add("{\"term\":\"ammoniuria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14289815\"]}");
	add("{\"term\":\"ammonoid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09218836\"]}");
	add("{\"term\":\"ammotragus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02418617\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }