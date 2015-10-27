package org.swtk.commons.dict.wordnet.index.name.instance.p.e.c.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePECT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pectin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15002791\"]}");
	add("{\"term\":\"pectinibranchia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01955453\"]}");
	add("{\"term\":\"pectinidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01968388\"]}");
	add("{\"term\":\"pectoral\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03909368\", \"05559344\"]}");
	add("{\"term\":\"pectoralis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05559344\"]}");
	add("{\"term\":\"pectus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05560240\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }