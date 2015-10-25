package org.swtk.commons.dict.wiktionary.generated.y.p.r;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryYPR000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ypres", "{\"term\":\"ypres\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\"], \"text\":\"From the French \u0027ypres\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A city in Flanders, Belgium; \u0027or\u0027, the municipality containing this city\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ypresian", "{\"term\":\"ypresian\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\"], \"text\":\"From the French \u0027ypresien\u0027 from \u0027ypres\u0027 + \u0027-ien\u0027 equivalent to \u0027ypres\u0027 + \u0027-ian\u0027 compare \u0027yperite\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A subdivision of the Eocene epoch\", \"priority\":1}]}, \"synonyms\":{}}");

	add("yprois", "{\"term\":\"yprois\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\"], \"text\":\"First attested in nominal use in May 1845 and in adjectival use in 1890; from the French noun \u0027yprois\u0027 and adjective \u0027yprois\u0027 both from \u0027ypres\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An of the of ; an inhabitant of the of the same name\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1845\u0027\u0027 May, “The Battle of the Spurs” in \u0027Colburn’s United Service Magazine and Naval and Military Journal\u0027 1845:II, [http://books.google.co.uk/books?id\u003dmgAcAQAAIAAJ\u0026amp;pg\u003dPA20\u0026amp;dq\u003d%22Yprois%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dDiz2TsLeNYK18QP57ZHLAQ\u0026amp;ved\u003d0CDcQ6AEwA\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003d%22Yprois%22\u0026amp;f\u003dfalse page 20\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A few amongst them even fled, some of whom in endeavouring to swim across the Lys were drowned, and others who made for the city were stopped by the \u0027\u0027Yprois\u0027\u0027 who manned the ramparts, and driven back to the fight\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"1910\u0027\u0027, Thomas Francis Bumpus, \u0027The Cathedrals and Churches of Belgium\u0027, [http://books.google.co.uk/books?id\u003dTCFUAAAAYAAJ\u0026amp;q\u003d%22Yprois%22\u0026amp;dq\u003d%22Yprois%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dFjj2TsG1Io_x8QOZ_ISkAQ\u0026amp;ved\u003d0CFYQ6AEwCDhu page 123\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"They were the work of the \u0027\u0027Yprois\u0027\u0027 Taillebert, who, both in stone and wood, has left in his native town and its neighbourhood incontestible proofs of his activity and talent\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"2010\u0027\u0027 June, Martha C. Howell, \u0027Commerce Before Capitalism in Europe, 1300–1600\u0027, “Introduction”, [http://books.google.co.uk/books?id\u003dZKhZTqkqfkEC\u0026amp;pg\u003dPA26\u0026amp;dq\u003d%22Yprois%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dpS_2ToSYCtP-8QP2zrmvAQ\u0026amp;ved\u003d0CDsQ6AEwA\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003d%22Yprois%22\u0026amp;f\u003dfalse page 26], footnote 42\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"David Nicholas provides fascinating detail about the mutual indebtedness of the \u0027\u0027Yprois\u0027\u0027 at the end of the thirteenth century\", \"priority\":9}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }