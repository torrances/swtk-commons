package org.swtk.commons.dict.wordnet.index.name.instance.c.h.i.m;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCHIM {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"chimaera\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01483972\", \"05777311\", \"09516693\"]}");
	add("{\"term\":\"chimaeridae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01483704\"]}");
	add("{\"term\":\"chimakum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09671983\"]}");
	add("{\"term\":\"chimaphila\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12277860\"]}");
	add("{\"term\":\"chimariko\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06933771\", \"09672103\"]}");
	add("{\"term\":\"chimborazo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09266521\"]}");
	add("{\"term\":\"chime\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03020822\"]}");
	add("{\"term\":\"chimera\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05777311\", \"09516693\"]}");
	add("{\"term\":\"chimney\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03642182\", \"03021082\"]}");
	add("{\"term\":\"chimneypiece\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03724882\"]}");
	add("{\"term\":\"chimneypot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03021585\"]}");
	add("{\"term\":\"chimneystack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03021712\"]}");
	add("{\"term\":\"chimneysweep\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09938519\"]}");
	add("{\"term\":\"chimneysweeper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09938519\"]}");
	add("{\"term\":\"chimonanthus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11721961\"]}");
	add("{\"term\":\"chimp\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02484454\"]}");
	add("{\"term\":\"chimpanzee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02484454\"]}");
	add("{\"term\":\"chimwini\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07005369\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }