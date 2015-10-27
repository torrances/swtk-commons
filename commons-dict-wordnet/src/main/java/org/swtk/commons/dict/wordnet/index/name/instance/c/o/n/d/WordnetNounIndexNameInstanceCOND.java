package org.swtk.commons.dict.wordnet.index.name.instance.c.o.n.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCOND {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"condemnation\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"01191772\", \"14598391\", \"07248294\", \"01225746\", \"06722631\"]}");
	add("{\"term\":\"condensate\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11466338\", \"15033332\"]}");
	add("{\"term\":\"condensation\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00358506\", \"06479794\", \"07327841\", \"11466338\", \"13472521\", \"06256830\"]}");
	add("{\"term\":\"condenser\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03091788\", \"03091943\", \"03092065\", \"02958683\"]}");
	add("{\"term\":\"condensing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00358506\"]}");
	add("{\"term\":\"condescendingness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04662525\"]}");
	add("{\"term\":\"condescension\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04662525\", \"06732153\", \"04895463\"]}");
	add("{\"term\":\"condiment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07826883\"]}");
	add("{\"term\":\"condition\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"05806871\", \"06783666\", \"13946473\", \"14569829\", \"05831106\", \"13943462\", \"06768279\", \"13943868\"]}");
	add("{\"term\":\"conditionality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13947102\"]}");
	add("{\"term\":\"conditioner\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03092476\", \"09972657\", \"00626791\"]}");
	add("{\"term\":\"conditioning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05760918\"]}");
	add("{\"term\":\"conditions\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"11545095\", \"13946063\", \"13946252\"]}");
	add("{\"term\":\"condo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03093036\"]}");
	add("{\"term\":\"condolence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06646199\"]}");
	add("{\"term\":\"condom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03092620\"]}");
	add("{\"term\":\"condominium\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03092845\", \"03093036\"]}");
	add("{\"term\":\"condonation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01229840\"]}");
	add("{\"term\":\"condor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01622177\"]}");
	add("{\"term\":\"condorcet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10926390\"]}");
	add("{\"term\":\"conduct\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04904939\", \"01223473\"]}");
	add("{\"term\":\"conductance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11524231\"]}");
	add("{\"term\":\"conducting\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01136081\", \"01138586\"]}");
	add("{\"term\":\"conduction\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11533251\"]}");
	add("{\"term\":\"conductivity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11533251\"]}");
	add("{\"term\":\"conductor\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03093163\", \"09972531\", \"14845213\", \"09972018\"]}");
	add("{\"term\":\"conductress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09972754\"]}");
	add("{\"term\":\"conduit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03093470\"]}");
	add("{\"term\":\"condyle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05479281\"]}");
	add("{\"term\":\"condylion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05239270\"]}");
	add("{\"term\":\"condylura\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01892381\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }