package org.swtk.commons.dict.wordnet.index.name.instance.e.n.d.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceENDI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"endicott\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10978877\"]}");
	add("{\"term\":\"ending\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"06410044\", \"07306035\", \"15291722\", \"00210792\", \"06319755\"]}");
	add("{\"term\":\"endive\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07747563\", \"11973808\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }