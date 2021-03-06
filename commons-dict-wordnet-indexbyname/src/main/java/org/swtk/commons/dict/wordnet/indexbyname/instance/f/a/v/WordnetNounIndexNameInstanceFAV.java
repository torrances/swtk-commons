package org.swtk.commons.dict.wordnet.indexbyname.instance.f.a.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFAV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fava bean\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07745360\", \"12596828\"]}");
	add("{\"term\":\"favism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14188563\"]}");
	add("{\"term\":\"favor\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03900459\", \"07515653\", \"06210352\", \"05163702\", \"01229430\"]}");
	add("{\"term\":\"favorable position\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05166002\"]}");
	add("{\"term\":\"favorable reception\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14435778\"]}");
	add("{\"term\":\"favorableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05168179\"]}");
	add("{\"term\":\"favorite\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10133522\", \"10011405\", \"05798763\"]}");
	add("{\"term\":\"favorite son\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10102331\"]}");
	add("{\"term\":\"favoritism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01156043\", \"06209181\"]}");
	add("{\"term\":\"favour\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01229430\", \"03900459\", \"05163702\", \"06210352\", \"07515653\"]}");
	add("{\"term\":\"favourable position\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05166002\"]}");
	add("{\"term\":\"favourable reception\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14435778\"]}");
	add("{\"term\":\"favourableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05168179\"]}");
	add("{\"term\":\"favourite\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05798763\", \"10011405\", \"10133522\"]}");
	add("{\"term\":\"favouritism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01156043\", \"06209181\"]}");
	add("{\"term\":\"favus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14205585\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }