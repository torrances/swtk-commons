package org.swtk.commons.dict.wordnet.index.name.instance.t.r.e.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTREA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"treachery\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00751065\", \"04887159\"]}");
	add("{\"term\":\"treacle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06788770\", \"07876184\"]}");
	add("{\"term\":\"tread\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04484066\", \"04484207\", \"04484326\", \"00286733\"]}");
	add("{\"term\":\"treadle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03909502\"]}");
	add("{\"term\":\"treadmill\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00607234\", \"04484454\", \"04484622\"]}");
	add("{\"term\":\"treadwheel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04484454\"]}");
	add("{\"term\":\"treason\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00751065\", \"04886853\", \"00783726\"]}");
	add("{\"term\":\"treasonist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10742614\"]}");
	add("{\"term\":\"treasure\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"08480980\", \"13391621\", \"03437882\", \"13391842\"]}");
	add("{\"term\":\"treasurer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10746908\"]}");
	add("{\"term\":\"treasurership\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00606361\"]}");
	add("{\"term\":\"treasury\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"04485060\", \"08156795\", \"10747110\", \"13415499\", \"08137210\", \"13378158\"]}");
	add("{\"term\":\"treat\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07304081\", \"07572730\"]}");
	add("{\"term\":\"treater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10371605\"]}");
	add("{\"term\":\"treatise\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06420294\"]}");
	add("{\"term\":\"treatment\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07152793\", \"04937153\", \"01137182\", \"00659325\"]}");
	add("{\"term\":\"treaty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06786235\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }