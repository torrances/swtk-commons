package org.swtk.commons.dict.wordnet.index.name.instance.a.t.h.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceATHE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"atheism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05989123\"]}");
	add("{\"term\":\"atheist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09839449\"]}");
	add("{\"term\":\"athelstan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10847117\"]}");
	add("{\"term\":\"athena\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09580516\"]}");
	add("{\"term\":\"athenaeum\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02755204\", \"08245326\"]}");
	add("{\"term\":\"athene\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01624635\", \"09580516\"]}");
	add("{\"term\":\"atheneum\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02755204\", \"08245326\"]}");
	add("{\"term\":\"athenian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09730528\"]}");
	add("{\"term\":\"athens\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09099493\", \"09153279\", \"08803195\"]}");
	add("{\"term\":\"atherinidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02604845\"]}");
	add("{\"term\":\"atherinopsis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02605250\"]}");
	add("{\"term\":\"atherodyde\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04058381\"]}");
	add("{\"term\":\"atherogenesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14132058\"]}");
	add("{\"term\":\"atheroma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05276994\"]}");
	add("{\"term\":\"atherosclerosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14132195\"]}");
	add("{\"term\":\"atherurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02349792\"]}");
	add("{\"term\":\"athetosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14132420\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }