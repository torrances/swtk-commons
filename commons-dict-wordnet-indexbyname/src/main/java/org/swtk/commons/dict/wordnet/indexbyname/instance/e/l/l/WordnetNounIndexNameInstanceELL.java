package org.swtk.commons.dict.wordnet.indexbyname.instance.e.l.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceELL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03286732\"]}");
	add("{\"term\":\"ellas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08798733\"]}");
	add("{\"term\":\"elli\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09603022\"]}");
	add("{\"term\":\"ellington\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10978002\"]}");
	add("{\"term\":\"ellipse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13900945\"]}");
	add("{\"term\":\"ellipsis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13494919\"]}");
	add("{\"term\":\"ellipsoid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13919891\"]}");
	add("{\"term\":\"ellipticity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05077791\"]}");
	add("{\"term\":\"ellison\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10978174\"]}");
	add("{\"term\":\"ellsworth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10978373\"]}");
	add("{\"term\":\"ellul\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15241556\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }