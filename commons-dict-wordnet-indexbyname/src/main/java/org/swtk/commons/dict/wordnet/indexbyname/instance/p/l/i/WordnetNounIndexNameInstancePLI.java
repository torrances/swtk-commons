package org.swtk.commons.dict.wordnet.indexbyname.instance.p.l.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePLI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pliability\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04667087\", \"05029875\"]}");
	add("{\"term\":\"pliancy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04667087\", \"05030188\"]}");
	add("{\"term\":\"pliantness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04667087\", \"05030188\"]}");
	add("{\"term\":\"plica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05499911\"]}");
	add("{\"term\":\"plication\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00407621\", \"13930429\"]}");
	add("{\"term\":\"plicatoperipatus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02003008\"]}");
	add("{\"term\":\"plier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10461667\"]}");
	add("{\"term\":\"pliers\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03973308\"]}");
	add("{\"term\":\"plight\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07242765\", \"14432050\"]}");
	add("{\"term\":\"plimsoll\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03973602\", \"08613892\"]}");
	add("{\"term\":\"plinth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03909987\"]}");
	add("{\"term\":\"pliny\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11259557\", \"11259755\"]}");
	add("{\"term\":\"pliocene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15150275\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }