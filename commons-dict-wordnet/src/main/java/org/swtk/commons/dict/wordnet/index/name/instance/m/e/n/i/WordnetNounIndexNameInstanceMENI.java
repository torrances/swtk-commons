package org.swtk.commons.dict.wordnet.index.name.instance.m.e.n.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMENI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"menial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10328605\"]}");
	add("{\"term\":\"meniere\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11194109\"]}");
	add("{\"term\":\"meninges\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05334448\"]}");
	add("{\"term\":\"meningioma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14263225\"]}");
	add("{\"term\":\"meningism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14383221\"]}");
	add("{\"term\":\"meningitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14161311\"]}");
	add("{\"term\":\"meningocele\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14490756\"]}");
	add("{\"term\":\"meningoencephalitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14366816\"]}");
	add("{\"term\":\"meninx\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05334448\"]}");
	add("{\"term\":\"menippe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01980007\"]}");
	add("{\"term\":\"meniscectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00687535\"]}");
	add("{\"term\":\"meniscium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13250125\"]}");
	add("{\"term\":\"meniscus\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03751203\", \"03751355\", \"05295895\"]}");
	add("{\"term\":\"menispermaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11733296\"]}");
	add("{\"term\":\"menispermum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11733503\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }