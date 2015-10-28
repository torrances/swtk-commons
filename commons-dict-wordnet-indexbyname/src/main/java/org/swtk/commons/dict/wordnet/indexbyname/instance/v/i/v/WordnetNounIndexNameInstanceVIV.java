package org.swtk.commons.dict.wordnet.indexbyname.instance.v.i.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVIV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"viva\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07213506\"]}");
	add("{\"term\":\"vivacity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04641656\"]}");
	add("{\"term\":\"vivaldi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11387905\"]}");
	add("{\"term\":\"vivarium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04546498\"]}");
	add("{\"term\":\"viverra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02138138\"]}");
	add("{\"term\":\"viverricula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02138378\"]}");
	add("{\"term\":\"viverridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02137241\"]}");
	add("{\"term\":\"viverrinae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02137241\"]}");
	add("{\"term\":\"viverrine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02137623\"]}");
	add("{\"term\":\"vividness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04982607\", \"05200606\"]}");
	add("{\"term\":\"vivification\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01050390\", \"04639057\"]}");
	add("{\"term\":\"vivisection\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00718029\"]}");
	add("{\"term\":\"vivisectionist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10777875\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }