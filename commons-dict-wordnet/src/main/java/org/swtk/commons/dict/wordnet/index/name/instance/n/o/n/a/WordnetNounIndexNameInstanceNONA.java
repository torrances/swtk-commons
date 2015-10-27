package org.swtk.commons.dict.wordnet.index.name.instance.n.o.n.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNONA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"nonabsorbency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04949915\"]}");
	add("{\"term\":\"nonacceptance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00206198\"]}");
	add("{\"term\":\"nonaccomplishment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00067036\"]}");
	add("{\"term\":\"nonachievement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00067036\"]}");
	add("{\"term\":\"nonachiever\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10756051\"]}");
	add("{\"term\":\"nonage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15177221\"]}");
	add("{\"term\":\"nonagenarian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10379952\"]}");
	add("{\"term\":\"nonaggression\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06674668\"]}");
	add("{\"term\":\"nonagon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13905296\"]}");
	add("{\"term\":\"nonalignment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08311316\"]}");
	add("{\"term\":\"nonalinement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08311316\"]}");
	add("{\"term\":\"nonallele\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05447518\"]}");
	add("{\"term\":\"nonappearance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01236808\"]}");
	add("{\"term\":\"nonattendance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01236655\"]}");
	add("{\"term\":\"nonattender\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10382616\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }