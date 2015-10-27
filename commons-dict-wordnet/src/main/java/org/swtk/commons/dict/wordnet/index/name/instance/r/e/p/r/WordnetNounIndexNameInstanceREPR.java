package org.swtk.commons.dict.wordnet.index.name.instance.r.e.p.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceREPR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"reprehensibility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04860443\"]}");
	add("{\"term\":\"reprehension\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06724794\"]}");
	add("{\"term\":\"representation\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"00900216\", \"05194979\", \"06752531\", \"06906924\", \"07218048\", \"08354035\", \"14023888\", \"01219989\", \"04083958\", \"05935308\"]}");
	add("{\"term\":\"representative\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05828980\", \"09975260\", \"10657783\", \"10541628\"]}");
	add("{\"term\":\"represser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09430419\"]}");
	add("{\"term\":\"repression\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00421707\", \"13571292\", \"14020056\"]}");
	add("{\"term\":\"repressor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09430419\"]}");
	add("{\"term\":\"reprieve\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01261714\", \"06560308\", \"07382856\", \"14469500\"]}");
	add("{\"term\":\"reprimand\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06724794\"]}");
	add("{\"term\":\"reprint\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06280438\", \"06280961\"]}");
	add("{\"term\":\"reprinting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06280961\"]}");
	add("{\"term\":\"reprisal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01238511\"]}");
	add("{\"term\":\"reproach\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14465180\", \"06726451\"]}");
	add("{\"term\":\"reproacher\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10759674\"]}");
	add("{\"term\":\"reprobate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10541917\"]}");
	add("{\"term\":\"reprobation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06210777\", \"14437550\"]}");
	add("{\"term\":\"reproducer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04084542\"]}");
	add("{\"term\":\"reproducibility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04813397\"]}");
	add("{\"term\":\"reproduction\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00851153\", \"01021843\", \"04083645\", \"05770480\", \"13571521\"]}");
	add("{\"term\":\"reproof\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06724794\"]}");
	add("{\"term\":\"reproval\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06724794\"]}");
	add("{\"term\":\"reprover\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10759674\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }