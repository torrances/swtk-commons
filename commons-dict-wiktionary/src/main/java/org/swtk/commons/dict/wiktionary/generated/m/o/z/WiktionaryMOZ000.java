package org.swtk.commons.dict.wiktionary.generated.m.o.z;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryMOZ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("mozo", "{\"term\":\"mozo\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Spanish\"], \"text\":\"From Spanish {{m|es|mozo}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A male servant, especially an attendant to a bullfighter\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1992\u0027\u0027: When he rode up to the gerente’s house that morning he was accompanied by four friends and by a retinue of \u0027\u0027mozos\u0027\u0027 and two packanimals saddled with hardwood kiacks, one empty, the other carrying their noon provisions. — Cormac McCarthy, \u0027All the Pretty Horses\", \"priority\":2}]}, \"synonyms\":{}}");

	add("mozarab", "{\"term\":\"mozarab\", \"etymology\":{\"influencers\":[], \"languages\":[\"Arabic\", \"English\", \"Spanish\"], \"text\":\"From Spanish \u0027mozárabe\u0027 from Arabic \u0027مُسْتَعْرَب\u0027 (arabized)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An Iberian Christian living under Arab domination\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2011\u0027\u0027, Yasmine Beale-Rivaya, \u0027American Speech\u0027, vol. 86, no. 4, \u0026quot;Maintaining a Language of Culture: Outcomes of Medieval Iberian Shift as a Predictor for Spanish in the American Southwest\u0027, p. 41\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027Mozarabs\u0027\u0027 were bilingual in Romance and Arabic and lived along th border area (north of the border to be precise) between Christian Iberia and Al-Andalus. This particular community sought to remain bilingual because it derived its identity from being both Arab-like and Christian\", \"priority\":3}]}, \"synonyms\":{}}");

	add("mozart", "{\"term\":\"mozart\", \"etymology\":{\"influencers\":[], \"languages\":[\"German\", \"English\"], \"text\":\"The surname was first recorded c. 14th century as \u0027Mozahrt\u0027 in Germany, from an old German (w:Alemannic German|Alemannic dialect) word \u0027moszen\u0027 meaning mosses. Originally used as a given name with the common suffix \u0027-hart\u0027 and used as a negative nickname for dirty or sloppy people.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"By analogy with w:Wolfgang Amadeus Wolfgang Amadeus Mozart,\u0027 a musical virtuoso\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Sir William Mitchell, \u0027The Place of Minds in the World\u0027 (1933) p. 142\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"One child is a \u0027\u0027Mozart\u0027\u0027 with a flying start, while another foots it, and makes little way; but the course is the same, being set by the object\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Joseph Lane Hancock, \u0027Nature Sketches in Temperate America: A Series of Sketches and Popular Account of Insects, Birds,...\u0027 (1911) p. 103\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"He is a \u0027\u0027Mozart\u0027\u0027 in the insect world, sending out his strain upon the evening air\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Henry Ward Beecher, \u0027Plymouth Pulpit: Sermons Preached in Plymouth Church, Brooklyn\u0027 (1875) p. 446\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"W]e can understand how a father who is a good musician may have a son who is a \u0027\u0027Mozart\u0027\u0027—a genius in music\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"By extension,\u0027 a virtuoso in any field\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"Ryan A Nerz, \u0027Eat This Book: a year of gorging and glory on the competitive eating circuit\u0027 (2006) p. 67\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"There is a \u0027\u0027Mozart\u0027\u0027 of competitive eating who is yet to reveal himself\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"Victor H. Mair, \u0027The Columbia History of Chinese Literature\u0027 (2001) p. 296\", \"priority\":11},{\"upperType\":\"NOUN\", \"text\":\"Li Po is the most musical, most versatile, and most engaging of Chinese poets, a \u0027\u0027Mozart\u0027\u0027 of words\", \"priority\":12},{\"upperType\":\"NOUN\", \"text\":\"Lawrence Grobel, \u0027Endangered Species: Writers Talk about Their Craft, Their Visions, Their Lives\u0027 (2001\", \"priority\":13},{\"upperType\":\"NOUN\", \"text\":\"Joyce Carol Oates has said, \u0026quot;If there is a \u0027\u0027Mozart\u0027\u0027 of interviewers, Larry Grobel is that individual.\u0026quot\", \"priority\":14},{\"upperType\":\"NOUN\", \"text\":\"Kathryn Ann Lindskoog, \u0027Surprised by C.S. Lewis, George MacDonald, and Dante: An Array of Original Discoveries\u0027 (2001) p. 116\", \"priority\":15},{\"upperType\":\"NOUN\", \"text\":\"In contrast, MacDonald\u0027s Gibbie is not only a moral prodigy, but also a \u0027\u0027Mozart\u0027\u0027 of religious sensibility\", \"priority\":16},{\"upperType\":\"NOUN\", \"text\":\"Noel Bertram Gerson, \u0027Harriet Beecher Stowe: a biography\u0027 (1976) p. 86\", \"priority\":17},{\"upperType\":\"NOUN\", \"text\":\"By the same token, Rembrandt resembled Hawthorne, and the architect who had designed Melrose Abbey was a \u0027\u0027Mozart\u0027\u0027 among architects\", \"priority\":18}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }