package org.swtk.commons.dict.wordnet.indexbyname.instance.t.o.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTOC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tocainide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04451052\"]}");
	add("{\"term\":\"tocantins\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09482523\"]}");
	add("{\"term\":\"tocantins river\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09482523\"]}");
	add("{\"term\":\"toccata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07058099\"]}");
	add("{\"term\":\"tocharian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06981381\"]}");
	add("{\"term\":\"tocktact\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07412555\"]}");
	add("{\"term\":\"tocology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06062970\"]}");
	add("{\"term\":\"tocopherol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15116976\"]}");
	add("{\"term\":\"tocqueville\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11364332\"]}");
	add("{\"term\":\"tocsin\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04451255\", \"07280591\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }