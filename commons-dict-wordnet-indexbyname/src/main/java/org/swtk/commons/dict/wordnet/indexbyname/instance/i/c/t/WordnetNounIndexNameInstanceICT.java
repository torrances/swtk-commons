package org.swtk.commons.dict.wordnet.indexbyname.instance.i.c.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceICT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ictalurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02522207\"]}");
	add("{\"term\":\"ictalurus punctatus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02522317\"]}");
	add("{\"term\":\"icteria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01572354\"]}");
	add("{\"term\":\"icteria virens\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01572612\"]}");
	add("{\"term\":\"icteridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01574219\"]}");
	add("{\"term\":\"icterus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01574815\", \"14343111\"]}");
	add("{\"term\":\"icterus galbula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01574969\"]}");
	add("{\"term\":\"icterus galbula bullockii\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01575295\"]}");
	add("{\"term\":\"icterus galbula galbula\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01575130\"]}");
	add("{\"term\":\"icterus neonatorum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14343443\"]}");
	add("{\"term\":\"icterus spurius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01575423\"]}");
	add("{\"term\":\"ictiobus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01447946\"]}");
	add("{\"term\":\"ictiobus niger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01448234\"]}");
	add("{\"term\":\"ictodosaur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01724208\"]}");
	add("{\"term\":\"ictodosauria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01724045\"]}");
	add("{\"term\":\"ictonyx\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02446734\"]}");
	add("{\"term\":\"ictonyx frenata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02447015\"]}");
	add("{\"term\":\"ictonyx striata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02446882\"]}");
	add("{\"term\":\"ictus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14105423\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }