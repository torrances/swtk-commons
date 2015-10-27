package org.swtk.commons.dict.wordnet.index.name.instance.g.o.l.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGOLD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gold\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"05148739\", \"13374461\", \"14662977\", \"04973417\", \"13392933\"]}");
	add("{\"term\":\"goldbeater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10155362\"]}");
	add("{\"term\":\"goldberg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11024481\"]}");
	add("{\"term\":\"goldbrick\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00755316\", \"03449201\", \"10155473\", \"10155666\"]}");
	add("{\"term\":\"goldbricking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00742776\"]}");
	add("{\"term\":\"goldcrest\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01566586\"]}");
	add("{\"term\":\"goldcup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11740822\"]}");
	add("{\"term\":\"goldenbush\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11972815\", \"11996639\"]}");
	add("{\"term\":\"goldeneye\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01853014\", \"02267728\"]}");
	add("{\"term\":\"goldenrod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12036428\"]}");
	add("{\"term\":\"goldenseal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11756039\"]}");
	add("{\"term\":\"goldfield\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08596794\"]}");
	add("{\"term\":\"goldfields\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12008601\"]}");
	add("{\"term\":\"goldfinch\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01533819\", \"01534966\"]}");
	add("{\"term\":\"goldfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01446178\"]}");
	add("{\"term\":\"goldilocks\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11954708\"]}");
	add("{\"term\":\"golding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11024727\"]}");
	add("{\"term\":\"goldman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11024857\"]}");
	add("{\"term\":\"goldmark\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11025046\"]}");
	add("{\"term\":\"goldmine\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03450053\", \"03450150\"]}");
	add("{\"term\":\"goldoni\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11025316\"]}");
	add("{\"term\":\"goldsboro\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09151481\"]}");
	add("{\"term\":\"goldsmith\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11025425\", \"10156135\"]}");
	add("{\"term\":\"goldstone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14914008\"]}");
	add("{\"term\":\"goldthread\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11752521\"]}");
	add("{\"term\":\"goldworker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10156135\"]}");
	add("{\"term\":\"goldwyn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11025567\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }