package org.swtk.commons.dict.wordnet.indexbyname.instance.e.m.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEME {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"emeer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10072305\"]}");
	add("{\"term\":\"emendation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01252795\"]}");
	add("{\"term\":\"emerald\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04975233\", \"13393838\", \"14873825\"]}");
	add("{\"term\":\"emergence\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00045193\", \"00051513\", \"07334509\", \"07339273\"]}");
	add("{\"term\":\"emergency\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03488720\", \"14056081\", \"07432005\"]}");
	add("{\"term\":\"emeritus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10071669\"]}");
	add("{\"term\":\"emersion\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00051513\", \"07336738\"]}");
	add("{\"term\":\"emerson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10978544\"]}");
	add("{\"term\":\"emery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14698304\"]}");
	add("{\"term\":\"emeside\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03305523\"]}");
	add("{\"term\":\"emesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00119553\"]}");
	add("{\"term\":\"emetic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03288430\"]}");
	add("{\"term\":\"emetrol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03288628\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }