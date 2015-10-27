package org.swtk.commons.dict.wordnet.index.name.instance.c.l.a.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCLAM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"clam\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07802662\", \"13417070\", \"01959122\"]}");
	add("{\"term\":\"clamatores\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01549784\"]}");
	add("{\"term\":\"clambake\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07592534\"]}");
	add("{\"term\":\"clamber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00326328\"]}");
	add("{\"term\":\"clamminess\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14559687\"]}");
	add("{\"term\":\"clammyweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11887780\"]}");
	add("{\"term\":\"clamor\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07136826\", \"07392073\"]}");
	add("{\"term\":\"clamoring\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07136826\"]}");
	add("{\"term\":\"clamour\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07136826\"]}");
	add("{\"term\":\"clamouring\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07136826\"]}");
	add("{\"term\":\"clamp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03040851\"]}");
	add("{\"term\":\"clampdown\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00810628\"]}");
	add("{\"term\":\"clams\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13406389\"]}");
	add("{\"term\":\"clamshell\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03041093\", \"01959490\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }