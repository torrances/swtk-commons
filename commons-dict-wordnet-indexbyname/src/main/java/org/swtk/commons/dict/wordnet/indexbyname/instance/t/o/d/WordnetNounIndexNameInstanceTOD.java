package org.swtk.commons.dict.wordnet.indexbyname.instance.t.o.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTOD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13741515\"]}");
	add("{\"term\":\"toda\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06992403\", \"09695158\"]}");
	add("{\"term\":\"today\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"15180961\", \"15287732\"]}");
	add("{\"term\":\"todd\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10733966\", \"11364544\"]}");
	add("{\"term\":\"toddler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10734114\"]}");
	add("{\"term\":\"toddy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07935119\"]}");
	add("{\"term\":\"toddy palm\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12606390\", \"12607893\"]}");
	add("{\"term\":\"todea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12975394\"]}");
	add("{\"term\":\"todea barbara\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12975559\"]}");
	add("{\"term\":\"todea superba\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12975113\"]}");
	add("{\"term\":\"todidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01833719\"]}");
	add("{\"term\":\"todus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01833872\"]}");
	add("{\"term\":\"tody\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01834001\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }