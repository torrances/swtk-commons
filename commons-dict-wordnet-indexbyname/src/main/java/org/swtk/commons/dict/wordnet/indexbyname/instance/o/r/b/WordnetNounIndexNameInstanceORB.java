package org.swtk.commons.dict.wordnet.indexbyname.instance.o.r.b;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceORB {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"orb\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13922097\", \"05323575\"]}");
	add("{\"term\":\"orb web\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03858623\"]}");
	add("{\"term\":\"orbiculate leaf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13180161\"]}");
	add("{\"term\":\"orbignya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12613112\"]}");
	add("{\"term\":\"orbignya cohune\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12613883\"]}");
	add("{\"term\":\"orbignya martiana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12613305\"]}");
	add("{\"term\":\"orbignya phalerata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12613305\"]}");
	add("{\"term\":\"orbignya spesiosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12613305\"]}");
	add("{\"term\":\"orbison\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11236090\"]}");
	add("{\"term\":\"orbit\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"05292774\", \"08629897\", \"05132642\", \"14537641\", \"08629606\"]}");
	add("{\"term\":\"orbit period\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15315180\"]}");
	add("{\"term\":\"orbital cavity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05292774\"]}");
	add("{\"term\":\"orbital motion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07456502\"]}");
	add("{\"term\":\"orbital plane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13884409\"]}");
	add("{\"term\":\"orbital point\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05241923\"]}");
	add("{\"term\":\"orbital rotation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07456502\"]}");
	add("{\"term\":\"orbitale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05241923\"]}");
	add("{\"term\":\"orbiter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04144527\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }