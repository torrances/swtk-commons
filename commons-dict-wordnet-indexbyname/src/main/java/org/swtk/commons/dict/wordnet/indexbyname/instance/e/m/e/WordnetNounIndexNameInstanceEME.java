package org.swtk.commons.dict.wordnet.indexbyname.instance.e.m.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEME {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"emeer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10072305\"]}");
	add("{\"term\":\"emendation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01252795\"]}");
	add("{\"term\":\"emerald\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04975233\", \"13393838\", \"14873825\"]}");
	add("{\"term\":\"emerald creeper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12592286\"]}");
	add("{\"term\":\"emerald isle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08878165\"]}");
	add("{\"term\":\"emerald shiner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01444383\"]}");
	add("{\"term\":\"emergence\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00045193\", \"00051513\", \"07334509\", \"07339273\"]}");
	add("{\"term\":\"emergency\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03488720\", \"14056081\", \"07432005\"]}");
	add("{\"term\":\"emergency alert system\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07239583\"]}");
	add("{\"term\":\"emergency brake\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03488720\"]}");
	add("{\"term\":\"emergency exit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03350504\"]}");
	add("{\"term\":\"emergency landing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00053611\"]}");
	add("{\"term\":\"emergency medicine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06059204\"]}");
	add("{\"term\":\"emergency procedure\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00178632\"]}");
	add("{\"term\":\"emergency room\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03288132\"]}");
	add("{\"term\":\"emergent evolution\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13495333\"]}");
	add("{\"term\":\"emeritus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10071669\"]}");
	add("{\"term\":\"emersion\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00051513\", \"07336738\"]}");
	add("{\"term\":\"emerson\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10978544\"]}");
	add("{\"term\":\"emery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14698304\"]}");
	add("{\"term\":\"emery cloth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14873959\"]}");
	add("{\"term\":\"emery paper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14874050\"]}");
	add("{\"term\":\"emery rock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14874221\"]}");
	add("{\"term\":\"emery stone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14874221\"]}");
	add("{\"term\":\"emery wheel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03465079\"]}");
	add("{\"term\":\"emeside\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03305523\"]}");
	add("{\"term\":\"emesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00119553\"]}");
	add("{\"term\":\"emesis basin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03288324\"]}");
	add("{\"term\":\"emetic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03288430\"]}");
	add("{\"term\":\"emetrol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03288628\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }