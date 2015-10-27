package org.swtk.commons.dict.wordnet.index.name.instance.s.i.l.v;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSILV {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"silva\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09458309\"]}");
	add("{\"term\":\"silvan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10704963\"]}");
	add("{\"term\":\"silvanus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09599924\"]}");
	add("{\"term\":\"silver\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"04227590\", \"03366683\", \"04969239\", \"13393039\", \"14679133\"]}");
	add("{\"term\":\"silverback\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02484131\"]}");
	add("{\"term\":\"silverberry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12346695\"]}");
	add("{\"term\":\"silverbush\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12346695\", \"12527289\"]}");
	add("{\"term\":\"silverfish\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01446377\", \"02273275\"]}");
	add("{\"term\":\"silverpoint\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04228143\"]}");
	add("{\"term\":\"silverrod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12036903\"]}");
	add("{\"term\":\"silverside\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02605035\"]}");
	add("{\"term\":\"silversides\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01444551\", \"02605035\"]}");
	add("{\"term\":\"silversmith\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10618157\"]}");
	add("{\"term\":\"silverspot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02281115\"]}");
	add("{\"term\":\"silverstein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11320460\"]}");
	add("{\"term\":\"silversword\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11946834\"]}");
	add("{\"term\":\"silvertip\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02135232\"]}");
	add("{\"term\":\"silvervine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12392221\"]}");
	add("{\"term\":\"silverware\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04228491\"]}");
	add("{\"term\":\"silverweed\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12657884\", \"12845495\"]}");
	add("{\"term\":\"silverwork\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04228653\"]}");
	add("{\"term\":\"silverworker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10618157\"]}");
	add("{\"term\":\"silvex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15066862\"]}");
	add("{\"term\":\"silvia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01567271\"]}");
	add("{\"term\":\"silviculture\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06081695\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }