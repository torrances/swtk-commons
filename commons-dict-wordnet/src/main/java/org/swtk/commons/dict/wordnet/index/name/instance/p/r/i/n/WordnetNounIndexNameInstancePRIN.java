package org.swtk.commons.dict.wordnet.index.name.instance.p.r.i.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePRIN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"prince\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10492384\"]}");
	add("{\"term\":\"princedom\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08576025\", \"14456581\"]}");
	add("{\"term\":\"princeling\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10493303\", \"10493374\"]}");
	add("{\"term\":\"princess\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10493649\"]}");
	add("{\"term\":\"princeton\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04009811\", \"09136781\"]}");
	add("{\"term\":\"princewood\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12839106\", \"12839361\"]}");
	add("{\"term\":\"principal\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"10494031\", \"10494535\", \"13376883\", \"10668135\", \"10494230\", \"13421835\"]}");
	add("{\"term\":\"principality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08576025\"]}");
	add("{\"term\":\"principalship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00598744\"]}");
	add("{\"term\":\"principe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09015514\"]}");
	add("{\"term\":\"principen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02708510\"]}");
	add("{\"term\":\"principle\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"05801218\", \"06668133\", \"05882839\", \"05881099\", \"05964190\", \"05922132\"]}");
	add("{\"term\":\"prinia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01568445\"]}");
	add("{\"term\":\"prinival\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03682634\"]}");
	add("{\"term\":\"print\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"03932813\", \"04010232\", \"04010358\", \"06690891\", \"06811608\", \"04009955\", \"06691047\"]}");
	add("{\"term\":\"printer\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04010851\", \"04011143\", \"10494882\"]}");
	add("{\"term\":\"printing\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"06602491\", \"06690047\", \"01105064\", \"06414934\"]}");
	add("{\"term\":\"printmaker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10495272\"]}");
	add("{\"term\":\"printmaking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00939292\"]}");
	add("{\"term\":\"printout\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07279743\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }