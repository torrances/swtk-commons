package org.swtk.commons.dict.wordnet.index.name.instance.h.u.m.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHUMA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"human\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02474924\"]}");
	add("{\"term\":\"humaneness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04836156\"]}");
	add("{\"term\":\"humanisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00265618\"]}");
	add("{\"term\":\"humanism\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08493840\", \"05976058\", \"05976269\"]}");
	add("{\"term\":\"humanist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10211007\", \"10210811\"]}");
	add("{\"term\":\"humanitarian\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10211007\", \"10211232\"]}");
	add("{\"term\":\"humanitarianism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05976269\"]}");
	add("{\"term\":\"humanities\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06163352\"]}");
	add("{\"term\":\"humanity\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02475618\", \"04734196\", \"04836413\"]}");
	add("{\"term\":\"humanization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00265618\"]}");
	add("{\"term\":\"humankind\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02475618\"]}");
	add("{\"term\":\"humanness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04734196\"]}");
	add("{\"term\":\"humanoid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02713060\"]}");
	add("{\"term\":\"humans\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02475618\"]}");
	add("{\"term\":\"humate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14933128\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }