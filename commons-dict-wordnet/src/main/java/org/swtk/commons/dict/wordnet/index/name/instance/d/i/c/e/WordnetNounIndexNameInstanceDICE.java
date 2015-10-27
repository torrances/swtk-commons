package org.swtk.commons.dict.wordnet.index.name.instance.d.i.c.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDICE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dice\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03195713\"]}");
	add("{\"term\":\"dicentra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11930539\"]}");
	add("{\"term\":\"dicer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03196135\"]}");
	add("{\"term\":\"diceros\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02395676\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }