package org.swtk.commons.dict.wiktionary.generated.t.i.s;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryTIS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("tisane", "{\"term\":\"tisane\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle french (ca. 1400-1600)\", \"ancient greek (to 1453)\", \"Latin\", \"anglo-norman\"], \"text\":\"From Anglo-norman {{m|en|tysanne}}, Middle french (ca. 1400-1600) {{m|frm|ptisane}}, \u0027tisane\u0027 (barley water, medicinal drink) and their source, Latin {{m|en|ptisana}}, from Ancient greek (to 1453) \u0027πτισάνη\u0027 (peeled barley, barley-water) from \u0027πτίσσειν\u0027 (to peel)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A medicinal drink, originally made from barley soaked in water; a herbal tea\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1831\u0027\u0027, Alexander Macaulay, [http://books.google.co.uk/books?id\u003dlGZZAAAAIAAJ \u0027A dictionary of medicine, designed for popular use\u0027, 2nd edition], page 454\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Ptisan\u0027\u0027. A diluent drink which makes a great figure in the dietetic precepts of the ancients\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"“Neither,” said Poirot, “I shall go to bed and take a \u0027\u0027tisane\u0027\u0027. The expected has happened […\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"1932\u0027\u0027, \u0027Talleyrand\u0027, Folio Society 2010, p. 5\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"The sick people would take away also some herbs for their \u0027\u0027ptisan\u0027\u0027, some wine and other comforts […\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"1993\u0027\u0027, \u0027My Idea of Fun\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"As soon as he had opened the door he worked his way back to his high-backed Queen Anne armchair, where he picked up his bone-china cup and took a sip of a rarefied \u0027\u0027tisane\", \"priority\":8}]}, \"synonyms\":{}}");

	add("tissue", "{\"term\":\"tissue\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"From Old french (842-ca. 1400) \u0027tissu\u0027 past participle of \u0027\u0027 from Latin \u0027texere\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Thin, woven, gauze-like fabric\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"chapter\u003d17|url\u003dhttp://openlibrary.org/works/OL2004261W|passage\u003dThe face which emerged was not reassuring. It was blunt and grey, the nose springing thick and flat from high on the frontal bone of the forehead, whilst his eyes were narrow slits of dark in a tight bandage of \u0027\u0027tissue\u0027\u0027.\u0026amp;nbsp;[…\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A fine transparent silk material, used for veils, etc.; specifically, cloth interwoven with gold or silver threads, or embossed with figures\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Dryde\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"a robe of \u0027\u0027tissue\u0027\u0027, stiff with golden wir\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Milto\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"In their glittering \u0027\u0027tissues\u0027\u0027 bear emblazed / Holy memorials\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"A sheet of absorbent paper, especially one that is made to be used as tissue paper, toilet paper or a handkerchief\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"Absorbent paper as material\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"A group of similar cells that function together to do a specific jo\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"2014\u0027\u0027, Robert K. Bolger, Scott Korb, \u0026quot;[https://books.google.com/books?id\u003d_AKKAwAAQBAJ\u0026amp;pg\u003dPA104\u0026amp;dq\u003dtissue+foster+wallace\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ved\u003d0CDUQ6AEwAWoVChMI9tLj8vOqxwIVl0GICh2OVwi\", \"priority\":11},{\"upperType\":\"NOUN\", \"text\":\"v\u003donepage\u0026amp;q\u003dtissue%20foster%20wallace\u0026amp;f\u003dfalse Gesturing Toward Reality: David Foster Wallace and Philosophy\", \"priority\":12},{\"upperType\":\"NOUN\", \"text\":\"quot;What they lack is outermost brain \u0027\u0027tissue\u0027\u0027 that, at least in humans, prompts awareness and interpretation.\u0026quot\", \"priority\":13},{\"upperType\":\"NOUN\", \"text\":\"Web; texture; complicated fabrication; connected series\", \"priority\":14},{\"upperType\":\"NOUN\", \"text\":\"a \u0027\u0027tissue\u0027\u0027 of forgeries, or of lies\", \"priority\":15},{\"upperType\":\"NOUN\", \"text\":\"A. J. Balfou\", \"priority\":16},{\"upperType\":\"NOUN\", \"text\":\"unwilling to leave the dry bones of Agnosticism wholly unclothed with any living \u0027\u0027tissue\u0027\u0027 of religious emotion\", \"priority\":17}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }