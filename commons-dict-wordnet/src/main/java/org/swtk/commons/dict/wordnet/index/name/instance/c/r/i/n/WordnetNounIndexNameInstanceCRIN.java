package org.swtk.commons.dict.wordnet.index.name.instance.c.r.i.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCRIN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cringle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03137089\"]}");
	add("{\"term\":\"crinion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08540751\"]}");
	add("{\"term\":\"crinkle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13928798\"]}");
	add("{\"term\":\"crinkleroot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11902895\"]}");
	add("{\"term\":\"crinoid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02322779\"]}");
	add("{\"term\":\"crinoidea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02322619\"]}");
	add("{\"term\":\"crinoline\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03137317\", \"03137427\", \"03539760\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }