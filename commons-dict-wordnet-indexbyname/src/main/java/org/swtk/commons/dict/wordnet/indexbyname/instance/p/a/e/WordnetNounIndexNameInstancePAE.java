package org.swtk.commons.dict.wordnet.indexbyname.instance.p.a.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePAE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"paean\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07050608\", \"06706894\"]}");
	add("{\"term\":\"paederast\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10431612\"]}");
	add("{\"term\":\"paederasty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00859501\"]}");
	add("{\"term\":\"paediatrician\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09848006\"]}");
	add("{\"term\":\"paediatrics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06071181\"]}");
	add("{\"term\":\"paedophile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10432414\"]}");
	add("{\"term\":\"paedophilia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00739568\"]}");
	add("{\"term\":\"paella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07607532\"]}");
	add("{\"term\":\"paeonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11739589\"]}");
	add("{\"term\":\"paeoniaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11739380\"]}");
	add("{\"term\":\"paeony\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11739755\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }