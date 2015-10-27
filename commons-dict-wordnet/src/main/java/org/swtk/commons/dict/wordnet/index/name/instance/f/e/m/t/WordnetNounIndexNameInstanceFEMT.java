package org.swtk.commons.dict.wordnet.index.name.instance.f.e.m.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFEMT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"femtochemistry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06099652\"]}");
	add("{\"term\":\"femtometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13679309\"]}");
	add("{\"term\":\"femtometre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13679309\"]}");
	add("{\"term\":\"femtosecond\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15260484\"]}");
	add("{\"term\":\"femtovolt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13664588\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }