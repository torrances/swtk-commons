package org.swtk.commons.dict.wordnet.indexbyname.instance.a.r.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceARO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"aroeira blanca\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12785738\"]}");
	add("{\"term\":\"aroid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11799769\"]}");
	add("{\"term\":\"arolla pine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11632469\"]}");
	add("{\"term\":\"aroma\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05722413\", \"04987257\"]}");
	add("{\"term\":\"aromatherapy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00663439\"]}");
	add("{\"term\":\"aromatic aster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11956184\"]}");
	add("{\"term\":\"aromatic compound\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14634266\"]}");
	add("{\"term\":\"aromatic hydrocarbon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14792175\"]}");
	add("{\"term\":\"arouet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11388633\"]}");
	add("{\"term\":\"arousal\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00855465\", \"05686586\", \"14047468\", \"00243675\"]}");
	add("{\"term\":\"arouser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10783653\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }