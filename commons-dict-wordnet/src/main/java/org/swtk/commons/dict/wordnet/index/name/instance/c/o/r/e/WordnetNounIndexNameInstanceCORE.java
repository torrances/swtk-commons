package org.swtk.commons.dict.wordnet.index.name.instance.c.o.r.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCORE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"core\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"03112367\", \"03112555\", \"03112720\", \"06616419\", \"08325852\", \"09279801\", \"05929717\", \"09279721\", \"08541787\", \"08259144\"]}");
	add("{\"term\":\"coreference\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13821275\"]}");
	add("{\"term\":\"coregonidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02541361\"]}");
	add("{\"term\":\"coregonus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02541882\"]}");
	add("{\"term\":\"coreid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02242180\"]}");
	add("{\"term\":\"coreidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02241999\"]}");
	add("{\"term\":\"coreligionist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09985045\"]}");
	add("{\"term\":\"corelli\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10930700\"]}");
	add("{\"term\":\"coreopsis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11977319\"]}");
	add("{\"term\":\"corer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03113410\"]}");
	add("{\"term\":\"corespondent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09985155\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }