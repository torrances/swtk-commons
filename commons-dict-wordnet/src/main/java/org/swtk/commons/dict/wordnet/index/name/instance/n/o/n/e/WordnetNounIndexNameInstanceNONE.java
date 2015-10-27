package org.swtk.commons.dict.wordnet.index.name.instance.n.o.n.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNONE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"none\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01036417\", \"15253583\"]}");
	add("{\"term\":\"nonentity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09942876\", \"13983217\"]}");
	add("{\"term\":\"nonequivalence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04759669\"]}");
	add("{\"term\":\"nones\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15254872\"]}");
	add("{\"term\":\"nonessential\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09335551\"]}");
	add("{\"term\":\"nonesuch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10344909\"]}");
	add("{\"term\":\"nonevent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07298178\"]}");
	add("{\"term\":\"nonexistence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13983217\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }