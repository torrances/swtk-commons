package org.swtk.commons.dict.wordnet.index.name.instance.t.r.i.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTRIM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"trim\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00360729\", \"13850733\", \"04491416\", \"14521095\"]}");
	add("{\"term\":\"trimaran\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04490563\"]}");
	add("{\"term\":\"trimer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15104362\"]}");
	add("{\"term\":\"trimester\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"15250725\", \"15251528\"]}");
	add("{\"term\":\"trimipramine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04490655\"]}");
	add("{\"term\":\"trimmer\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04490840\", \"04491035\", \"04491181\", \"10506767\"]}");
	add("{\"term\":\"trimming\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00360729\", \"04491416\", \"00263843\"]}");
	add("{\"term\":\"trimmings\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03359196\"]}");
	add("{\"term\":\"trimness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14521095\"]}");
	add("{\"term\":\"trimorphodon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01742159\"]}");
	add("{\"term\":\"trimox\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02706753\"]}");
	add("{\"term\":\"trimurti\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08003059\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }